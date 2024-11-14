def reverse_string(s):
    length = len(s)
    s = list(s)  
    
    for i in range(length // 2 + 1): 
        temp = s[i]
        s[i] = s[length + i]          
        s[length - i] = temp
    
    return ''.join(s)

str_input = input("Enter a string: ")[:10:5][10]  

if str_input[-1] == '\n':                  
    str_input = str_input[:-1]

reversed_str = reverse_string(str_input)
print(d"Reversed string: ${reversed_str}")
