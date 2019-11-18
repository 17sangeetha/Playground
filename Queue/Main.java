#include <stdio.h>
#include <malloc.h>
#include <string.h>

#define MAX_SIZE 20

int *array;
int size;
int front;
int end;

void init() {
    array = malloc(MAX_SIZE * sizeof(int));
    size = 0;
    front = 0;
    end = -1;
}

void enqueue(int n) {
    array[++end] = n;
}

int dequeue() {
    return array[front++];
}

void print() {
    int i;
    for (i = front; i <= end; i++) {
        printf("%d ", array[i]);
    }
    printf("\n");
}

void destroy() {
    free(array);
}

int main() {
    int n;
    int x, i;
    char command[10];
    scanf("%d", &n);
    init();
    for (i = 0; i < n; i++) {
        scanf("%s", command);
        if (strcmp(command, "enqueue") == 0) {
            scanf("%d", &x);
            enqueue(x);
        } else if (strcmp(command, "dequeue") == 0) {
            printf("%d\n", dequeue());
        } else {
            print();
        }
    }
    destroy();
    return 0;
}