## Description du projet :  
Ce projet implémente un système bancaire simplifié en utilisant les principes de TDD. 
Le but est de simuler un compte bancaire avec des opérations de dépôt, de retrait et d'impression d'un relevé.  

## Fonctionnalités  
### 1) Dépot :  
![depot](https://github.com/user-attachments/assets/5066f2f0-89fd-46aa-859f-9b99c47f9ae3)  
  
### 2) retrait :  
![retrait](https://github.com/user-attachments/assets/9cd6df70-5039-4be7-b8e1-a34711211d01)  
  
### 3) Relevé :  
![relevé](https://github.com/user-attachments/assets/643bd262-f2a8-4edc-9a3a-e3c340cfe7a2)  
  
## Classe StatementPrinter :  
Cette classe est responsable de l'affichage du relevé bancaire. Elle formate les transactions et les imprime à l'écran.  
  
![StatementPrinter](https://github.com/user-attachments/assets/b8062110-ca5b-4dd7-9cc3-dd8d7bce50bf)  
  
## Test D'acceptation :  
Ce projet utilise Mockist TDD (approche de test avec des objets mockés) pour faciliter le développement et tester les interactions entre les classes, avant même que le code complet soit implémenté.  
  
![Test](https://github.com/user-attachments/assets/9e8e690e-0053-45f7-8202-7922db0959b4)  
![passed](https://github.com/user-attachments/assets/d4b29a87-53a3-43fa-8e3c-79345e59245e)  
debug :  
![passed2](https://github.com/user-attachments/assets/cf7deb89-223b-4a30-8d82-20816f16e452)  
  
## Instructions d'exécution
Clonez ce repository.  
Compilez le projet avec Maven.  
Exécutez les tests en utilisant JUnit.  
Pour afficher le relevé bancaire, appelez la méthode printStatement() sur une instance de la classe Account :  
  
![Main](https://github.com/user-attachments/assets/dc9ad774-83ff-44d4-b29f-f056fd1906e2)  
![Result](https://github.com/user-attachments/assets/4df16cfe-0127-41f4-8e08-f73c62ce589a)







