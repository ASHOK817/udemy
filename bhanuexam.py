"""from itertools import permutations
def is_prime(n):
    if n<1:
        return False
    for i in range(2,int (n**0.5)+1):
        if n%i==0:
            return False
        return True
def primeChecker(num):
    num_str = str(num)
    perms =[''.join(p)for p in permutations(num_str)]
    for perm in perms:
        if is_prime(int(perm)):
            return 0
    return 1
print(primeChecker(567))"""
def check_prime(num):
    num = int(num)
    if num == 0 or num == 1:
        return 0
    for i in range(2, num):
        if num % i == 0:
            return 0
    return 1

def permutate(complete, remaining):
    if remaining == "":
        li.append(check_prime(complete))
        return
    ch = remaining[0]
    for i in range(len(complete) + 1):
        s = complete[:i]
        p = complete[i:]
        permutate(s + ch + p, remaining[1:])

li = []

permutate("", "567")
if 1 in li:
    print(1)
else:
    print(0)
