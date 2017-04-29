arr = [x for x in range(0, 6)]


def contains_duplicates(array):
    for i in range(0, len(arr) - 1):
        for j in range(i + 1, len(arr)):
            if arr[i] == arr[j]:
                return True
    return False

print(contains_duplicates(arr))

arr = [1, 1, 1]

print(contains_duplicates(arr))


def gcd(a, b):
    return b if a % b == 0 else gcd(b, a % b)

print(gcd(4851, 3003))
