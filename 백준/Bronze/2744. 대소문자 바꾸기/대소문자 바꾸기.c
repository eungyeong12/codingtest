#include <stdio.h>
#include <string.h> 

int main(void) { 

  char s[101];
  scanf("%s", s);

  for(int i=0; i<101; i++) {
    if(s[i] >= 'a' && s[i] <= 'z') {
      s[i] -= 32;
    } else if(s[i] >= 'A' && s[i] <= 'Z') {
      s[i] += 32;
    } else {
      break;
    }
  }

  printf("%s", s);

  return 0;
}