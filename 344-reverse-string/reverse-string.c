
void reverseString(char* s, int sSize)
{
    char *end = s + sSize - 1;
    char temp;

    while (s < end)
    {
        temp = *s;
        *s = *end;
        *end = temp;

        s++;
        end--;
    }
}
