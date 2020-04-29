
#include <string.h>
#include <stdlib.h>
#include <stdio.h>


//reading from a file where each line is of type: Maria,2004
int main(){

  //read a CSV file, bankdata.csv
  FILE *bd = fopen("filename.csv", "r"); 
    if(bd == NULL){
    fprintf(stderr,"Error, unable to locate the data file bankdata.csv\n");
    exit(100);
    }

FILE *bd = fopen("filename.csv", "a+"); 
 char line[50]; 
 fgets(line, 50, bd);
 while(!feof(bd)){
        char *type; type = strtok(line, ","); 
        char *number = strtok(NULL, ","); 
        int num = atoi(number);
        
         fgets(line,50,bd);
    return(0);
  
}
}

