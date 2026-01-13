% Lógica Nebulosa - Gorjeta
clear;
clc;

% Variável de entrada: qualidade da comida (0 a 10)
qualidade = 0:0.1:10;

% Funções de pertinência (simples)
ruim = max(0, min(1, (5 - qualidade) / 5));
media = max(0, 1 - abs(qualidade - 5) / 5);
boa = max(0, min(1, (qualidade - 5) / 5));

% Regras de inferência
gorjeta = (ruim * 5 + media * 10 + boa * 20) ./ (ruim + media + boa);

% Gráfico
plot(qualidade, gorjeta, 'LineWidth', 2);
grid on;
xlabel('Qualidade da Comida');
ylabel('Percentual de Gorjeta (%)');
title('Lógica Nebulosa: Qualidade x Gorjeta');

