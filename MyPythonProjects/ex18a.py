from sys import argv

script, arg1, arg2 = argv


def print_two(*args):
    arg1, arg2 = args
    print(f"arg1: {arg1}, arg2: {arg2}")

# ok, that *args is actually pointless, we can just do this
def print_two_again(arg1, arg2):
    print(f"arg1: {arg1}, arg2: {arg2}")

# this just takes one argument
def print_one(arg1):
    print(f"arg1: {arg1}")  

# this one takes no arguments
def print_none():
    print("Nix gibt's.")


print_two(arg1, arg2)
print_two_again(arg1, arg2)
print_one("Erster!")
print_none()
