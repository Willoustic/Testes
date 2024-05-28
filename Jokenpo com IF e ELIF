import random
num = random.randint(3, 5)
if num == 3:
	ppt = 'Papel'
elif num == 4:
	ppt = 'Tesoura'
elif num == 5:
	ppt = 'Pedra'

print('\n|=====Jokenpo=====\n|Escolha um:')
print('|Digite "0" para Papel\n|Digite "1" para Tesoura\n|Digite "2" para Pedra')
print('=' * 5, 'Pressione enter após digitar o número!!', '=' * 5)
n = int(input('\n>>> '))
if n == 0:
	us = 'Papel'
elif n == 1:
	us = 'Tesoura'
elif n == 2:
	us = 'Pedra'
elif n != 0 and n != 1 and n != 2:
	us = '\033[31mInválido\033[m'
	print('\n' + us, '\n\033[31mTente Novamente\033[m')
if n == 0 and num == 3:
	print('\nEmpate')
elif n == 0 and num == 4:
	print('\nDerrota')
elif n == 0 and num == 5:
	print('\nVitoria')
elif n == 1 and num == 3:
	print('\nVitoria')
elif n == 1 and num == 4:
	print('\nEmpate')
elif n == 1 and num == 5:
	print('\nDerrota')
elif n == 2 and num == 3:
	print('\nDerrota')
elif n == 2 and num == 4:
	print('\nVitória')
elif n == 2 and num == 5:
	print('\nEmpate')

print('')
print('|Você: {}\n|CPU: {}'.format(us, ppt))
