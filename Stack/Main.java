#include <stdio.h>
#include <malloc.h>
#include <string.h>

#define MAX_SIZE 20

int *array;
int tos;

void init() {
    array = malloc(MAX_SIZE * sizeof(int));
    tos = -1;
}

void push(int n) {
    array[++tos] = n;
}

int pop() {
    return array[tos--];
}

void print() {
    int i;
    for (i = 0; i <= tos; i++) {
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
        if (strcmp(command, "push") == 0) {
            scanf("%d", &x);
            push(x);
        } else if (strcmp(command, "pop") == 0) {
            printf("%d\n", pop());
        } else {
            print();
        }
    }
    destroy();
    return 0;
}