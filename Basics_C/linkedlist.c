#include <stdlib.h>
#include <stdio.h>

struct LinkedList *head = NULL;
  struct LinkedList {
    int key;
    struct LinkedList *next;
  };
  
//add node in ascending order
int addPolyTerm(int newkey){

  struct LinkedList *temp;
  struct LinkedList *node = (struct LinkedList *) malloc(sizeof(struct LinkedList));
  temp = head;
  
  if(head == NULL || head->key > newkey){ 
    node->next = head;
    head = node;  
  }else{ 
    while(temp->next !=NULL && temp->next->key < newkey){
      temp = temp->next;
    }
    node->next = temp-> next;
    temp->next = node;
  }
 }
  return(0);
}

//iterate through list 
void display(){
  struct LinkedList *temp;
  temp = head; //temp node to help iterate
  while(temp != NULL){
    printf("%d\n", temp->key); \\or send to anothe function if you wish to add, multiply... the keys
    temp = temp->next; //update to iterate through the list
  }
 
