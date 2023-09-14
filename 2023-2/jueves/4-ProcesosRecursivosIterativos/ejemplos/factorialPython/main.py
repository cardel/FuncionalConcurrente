"""
Carlos A Delgado
Ejemplo de recursión en Python
14 de Septiembre de 2023
"""

def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n-1)

print(factorial(5))


def factorialIterativo(n):
    def factorialIterativoAux(acc, prod):
        if acc > n:
            return prod
        else:
            return factorialIterativoAux(acc+1, prod*acc)
    factorialIterativoAux(1, 1)

print(factorialIterativo(5))