

bool isValid(char* s)
{
    int n = strlen(s);
    char *stack = (char *)malloc(n * sizeof(char));
    int top = -1;

    for(int i = 0; i < n; i++)
    {
        // Push opening brackets
        if(s[i] == '(' || s[i] == '{' || s[i] == '[')
        {
            stack[++top] = s[i];
        }
        else
        {
            // No opening bracket available
            if(top == -1)
            {
                free(stack);
                return false;
            }

            // Check matching brackets
            if((s[i] == ')' && stack[top] != '(') ||
               (s[i] == '}' && stack[top] != '{') ||
               (s[i] == ']' && stack[top] != '['))
            {
                free(stack);
                return false;
            }

            // Pop the opening bracket
            top--;
        }
    }

    bool result = (top == -1);

    free(stack);
    return result;
}
