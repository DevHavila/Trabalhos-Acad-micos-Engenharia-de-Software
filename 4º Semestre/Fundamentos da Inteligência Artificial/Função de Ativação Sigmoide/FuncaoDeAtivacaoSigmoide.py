import numpy as np
import matplotlib.pyplot as plt

# Valores de entrada
x = np.linspace(-10, 10, 400)

# Função sigmoide
y = 1 / (1 + np.exp(-x))

# Plot
plt.figure(figsize=(8, 5))
plt.plot(x, y, color='red', linewidth=2)
plt.grid(True, linestyle='--', alpha=0.6)

# Títulos e rótulos
plt.title('Função de Ativação Sigmoide')
plt.xlabel('Entrada (x)')
plt.ylabel('Saída (y)')

# Limites dos eixos
plt.xlim(-10, 10)
plt.ylim(0, 1.05)

plt.show()
