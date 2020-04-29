/*This program is to implement a simple banking application 
There are three capabilities, add account number, make deposit and make withdrawal. 

Lorna Fernandez Ciruela
ID : 260848238

History --------------------------------------------------------------------
March 1st 2020 - Creation of file 
March 2nd 2020 - Work on struct and union
March 11th 2020 - Work on body functions
March 13th 2020 - Work on structure, and run tests
March 26th 2020 - Modifying loops because it was not working
March 30th 2020 - Correcting errors
April 1st 2020 - Delete print statements added when coding
----------------------------------------------------------------------------
*/

#include <string.h>
#include <stdlib.h>
#include <stdio.h>

//helper method to print error codes
int printe(int x){
  fprintf(stderr, "Error, incorrect usage!\n");
    switch (x){
        case 1: fprintf(stderr,"-a ACCTNUM NAME\n"); break;
        case 2: fprintf(stderr,"-d ACCTNUM DATE AMOUNT\n"); break;
        case 3: fprintf(stderr,"-w ACCTNUM DATE AMOUNT\n"); break;
        case 4: {
    fprintf(stderr,"-a ACCTNUM NAME\n-d ACCTNUM DATE AMOUNT\n");
    fprintf(stderr, "-w ACCTNUM DATE AMOUNT\n");}
        default: break;
    } 
  exit(1);
}

//helper function for adding bank account
int add(int accnum, char *str){
 FILE *bd = fopen("bankdata.csv", "a+"); 
 char line[50]; 
 fgets(line, 50, bd);
 while(!feof(bd)){
        char *type; type = strtok(line, ","); 
        char *number = strtok(NULL, ","); 
        int num = atoi(number);
        
         if(accnum==num) { //checking if it already exists by comparing acc number
            fprintf(stderr, "Error, account number %d already exists\n", accnum); 
            exit(50);
        } 
         fgets(line,50,bd);
  }
    fprintf(bd, "AC,%d,%s\n",accnum, str); //add account to the file if success 
    return(0);
}
  
//helper function for deposit transaction
int txd(int accnum, char *str, float amount){
 FILE *bd = fopen("bankdata.csv", "a+"); 
 char line[50]; 
 fgets(line, 50,bd);
 while(!feof(bd)){ 
        char *type; type = strtok(line, ","); 
        char *number = strtok(NULL, ",");  
        int num=atoi(number); 

        if(num == accnum) {//deposit amount if account exists
            fprintf(bd, "TX,%d,%s,%.2f\n",accnum,str,amount); 
            exit(0);
        } 
        fgets(line, 50, bd);
  }
    fprintf(stderr, "Error, account number %d does not exist\n", accnum); 
    exit(50); //error if the account does not exist
}

//helper function for withdraw transaction
int txw(int accnum, char *str, float amount){
 FILE *bd = fopen("bankdata.csv", "a+"); 
 float track = -1.00; //to see if account already exists
 char line[50]; 
 fgets(line,50,bd);
 while(!feof(bd)){
        char *type = strtok(line, ","); 
        char *number = strtok(NULL, ","); 
        int num = atoi(number); 

        if(num == accnum && !strcmp("AC",type)) {
          track = 0.00; //if only transaction is AC, then no balance
        }
        if(num == accnum && !strcmp("TX",type)){
          char *excess; 
          excess=strtok(NULL,","); 
          char *bal; 
          bal = strtok(NULL,","); 
          float balance = atof(bal);
            track=track+balance; //accumulate balance amount 
        }
        fgets(line,50,bd);
  }
 if(track != -1.00) {//check if amount exists
                if((track-amount) <= 0.00) {//checking that it can actually happen
                    fprintf(stderr, "Error, account number %d only has %.2f\n",accnum,track);
                    exit(60);
                }else{
                    fprintf(bd, "TX,%d,%s,-%.2f\n",accnum,str,amount);
                    return(0);
                }
 }else{ //in this case, the amount doese not exist
    fprintf(stderr, "Error, account number %d does not exist\n", accnum); 
    exit(50); 
 }
}

int main (int argc, char *argv[]){
  //print errors to stderr, use fprintf(stderr)

  if(argc < 2) printe(4); //check amount of inputs given

  //read a CSV file, bankdata.csv
  FILE *bd = fopen("bankdata.csv", "r"); 
    if(bd == NULL){
    fprintf(stderr,"Error, unable to locate the data file bankdata.csv\n");
    exit(100);
    }

  char *type; type = argv[1];

  switch(*(type+1)){//using switch to filter the action that the user wants to do
    case 'a': if(argc != 4) printe(1); //checking right inputs for add, same for deposit and withdraw
              else {int accnum = atoi(argv[2]); 
                    char *name; name = argv[3];
                     add(accnum,name); //calling add function
              }; break; 
    case 'd': if(argc != 5) printe(2);
              else {int accnum = atoi(argv[2]); 
                    char *name; name=argv[3]; 
                    float amount = atof(argv[4]);
                     txd(accnum, name, amount);
              }; break;
    case 'w': if(argc != 5) printe(3);
              else {int accnum=atoi(argv[2]); 
                    char *name; name=argv[3]; 
                    float amount=atof(argv[4]);
                     txw(accnum, name, amount);
              }; break;
    default: printe(4); //if none of the right inputs given, display error
  }
}

