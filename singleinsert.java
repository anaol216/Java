//to insert a new node in single node 
void insertFirst(singleList *head, int data) {
    singleList* newNode = new singleList;
    newNode->next = head;
    head = newNode;
}

Bro check this out, we don't need if conditions
