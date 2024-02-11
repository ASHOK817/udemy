def MissingDigit(exp):
    exp = exp.split()

    first_operand, operator, second_operand, resultant = map(str.strip, exp)

    if 'x' in resultant:
        x = resultant
        first_operand, second_operand = map(int, (first_operand, second_operand))
    else:
        resultant = int(resultant)
        if 'x' in first_operand:
            x, second_operand = first_operand, int(second_operand)
            if operator == '+':
                res = resultant - second_operand
            elif operator == '-':
                res = resultant + second_operand
            elif operator == '*':
                res = resultant // second_operand
            else:
                res = resultant * second_operand
        else:
            x, first_operand = second_operand, int(first_operand)
            if operator == '+':
                res = resultant - first_operand
            elif operator == '-':
                res = first_operand - resultant
            elif operator == '*':
                res = resultant // first_operand
            else:
                res = first_operand // resultant

    for i, char in enumerate(x):
        if char == 'x':
            return str(res)[i]

# Driver Code
if __name__ == '__main__':
    exp = "3x + 12 = 46"
    print(MissingDigit(exp))
