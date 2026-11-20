char* addBinary(char* a, char* b)
{
    int i = strlen(a) - 1;
    int j = strlen(b) - 1;

    int max = (i > j) ? i + 2 : j + 2;

    char *result = (char*)malloc(max + 1);
    result[max] = '\0';

    int carry = 0;
    int k = max - 1;

    while(i >= 0 || j >= 0 || carry)
    {
        int sum = carry;

        if(i >= 0)
        {
            sum += a[i] - '0';
            i--;
        }

        if(j >= 0)
        {
            sum += b[j] - '0';
            j--;
        }

        result[k] = (sum % 2) + '0';
        carry = sum / 2;
        k--;
    }

    return result + k + 1;
}