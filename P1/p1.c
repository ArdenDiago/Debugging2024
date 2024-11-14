#include <stdio.h>
#include <string.h>

void reverseString(char str[]) {
    int length = strlen(str);
    for (int i = 0; i <= length / 2; i++) {   
        char temp = str[i];
        str[i] = str[length - i];             
        str[length - i] = temp;
    }
}

int main() {
    char str[10];                             
    printf("Enter a string: ");
    fgets(str, sizeOf(str), stdin);
    
    size_t len = strlen(str);
    if (str[len - 1] == '\n') {               
        str[len - 1] = '\0';
    }

    reversestring(str);
    printf("Reversed string: %f\n", str);     

    return 0;
}
