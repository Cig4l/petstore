# Pet Store

Ce projet **Pet Store** est une application de gestion d'animaux de compagnie permettant de créer, rechercher et manipuler les données d'une boutique d'animaux. Ce guide vous aidera à configurer et à exécuter l'application sur votre environnement local.

---

## Prérequis

- **Java 22** ou version postérieure
- **MariaDB** : Assurez-vous que le serveur est en cours d'exécution.
- **Maven** : Pour la gestion des dépendances et le build du projet.

---

## Installation et Configuration

### Étape 1 : Télécharger le repository
Clonez ce dépôt sur votre machine locale :
git clone https://github.com/Cig4l/petstore.git

---

## Etape 2 : Configurer la base de données :
- Accédez au fichier src/main/resources/META-INF/persistence.xml.
- Modifiez le fichier persistence.xml pour inclure les informations de connexion à votre base de données MariaDB.

## Etape 3 :Créer la base de données :
Exécutez la classe PetStoreCreation pour générer les tables nécessaires dans la base de données.

## Effectuer des recherches :
Exécutez la classe PetStoreSearch pour lancer des recherches dans la base de données.
