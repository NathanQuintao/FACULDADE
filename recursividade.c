#include <stdio.h>
int fat(n) {
	//Função que calcula, recursivamente, o fatorial de n.
	int result;
	if ((n == 1) || (n == 0)) {
		printf("\nponto de parada atingido");
		return 1;
	}
	else {
		printf("\nchamando fat(%d-1)", n);

		result = fat(n - 1);

		printf("\nvoltando %d regra geral= %d x %d", result, result, n);
		result = result * n;
		printf("\nretornando %d", result);
		return result;
	}
}
int main() {
	int n;
	printf("Informe o número que deseja obter o fatorial:\n");
	scanf("%d", &n);
	printf("\nfat(%d) ", n);
	printf("\nO fatorial de %d é %d \n", n, fat(n));
	return 0;
}
