char* toHex(int num)
{
    char *result = (char*)malloc(9 * sizeof(char));
    char hex[] = "0123456789abcdef";

    if(num == 0)
    {
        result[0] = '0';
        result[1] = '\0';
        return result;
    }

    result[8] = '\0';
    int i = 7;

    while(num != 0 && i >= 0)
    {
        int rem = num & 15;
        result[i] = hex[rem];

        num = (unsigned int)num >> 4;
        i--;
    }

    int j = 0;

    while(i < 7)
    {
        result[j] = result[i + 1];
        j++;
        i++;
    }

    result[j] = '\0';

    return result;
}