"""
Carlos A Delgado
24 de Agosto de 2023
Resolver sumatoria de clase
"""

def suma(n):
    suma = 0
    for i in range(-10000,2*n**2+1):
        suma += i**2+2

    return suma

def fsuma(n):
    x = 2*n**2+10001
    a = x*(x+1)*(2*x+1)/6
    b = -20002*x*(x+1)/2
    c = 10001**2*x+2*x
    return a+b+c

for n in range(1,10):
    print(n,suma(n),fsuma(n))
