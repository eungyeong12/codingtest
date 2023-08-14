#include <stdio.h>
#include <string.h>

int main(void) {

  char s[101];
  int length = 0;
  scanf("%s", s);

  length = strlen(s);
  printf("%d", length);

  return 0;
}