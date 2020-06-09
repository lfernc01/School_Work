
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


//Read numbers from file, and store them in different files
int main(int argc, char* argv[]){
  char *filename = argv[1];
  FILE *data = fopen(filename,"rt");
  FILE *file = fopen("file.txt", "wt");
  char line[50];

  //read numbers from file given
  fgets(line,50,data);
  while(!feof(data)){
      fputs(line,file);
      fgets(line,50,data);
  }
  fclose(file);
  fclose(data);

}

