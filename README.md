### Gestion de la Billetterie des Jeux Olympiques - API Documentation

Bienvenue dans la documentation de l'API pour la gestion de la billetterie des Jeux Olympiques. Cette API vous permet de gérer les réservations de billets pour différents événements olympiques.

---

#### Contexte du Projet

L'API a été conçue pour répondre aux besoins suivants :

- Permettre aux utilisateurs de s'inscrire à des événements en tant que spectateurs.
- Connecter les utilisateurs et leur permettre d'acheter des billets individuels ou en groupe.
- Permettre à l'administrateur de gérer les événements, y compris la fermeture ou l'ouverture des réservations, l'ajout de billets, le report et l'annulation des événements.
- Assurer la cohérence des événements planifiés dans les stades.

---

#### Utilisation de l'API

Cette API fournit plusieurs endpoints pour gérer les utilisateurs, les billets, les stades et les événements. Voici un aperçu des principales fonctionnalités :

- **Utilisateurs**
    - `GET /api/users/{id}`: Obtenir un utilisateur par son ID.
    - `POST /api/users`: Ajouter un nouvel utilisateur.
    - `PUT /api/users/{id}`: Mettre à jour un utilisateur existant.
    - `DELETE /api/users/{id}`: Supprimer un utilisateur.

- **Billets**
    - `GET /api/tickets/{id}`: Obtenir un billet par son ID.
    - `POST /api/tickets`: Ajouter un nouveau billet.
    - `PUT /api/tickets/{id}`: Mettre à jour un billet existant.
    - `DELETE /api/tickets/{id}`: Supprimer un billet.

- **Stades**
    - `GET /api/stadiums/{id}`: Obtenir un stade par son ID.
    - `POST /api/stadiums/add`: Ajouter un nouveau stade.
    - `PUT /api/stadiums/{id}`: Mettre à jour un stade existant.
    - `DELETE /api/stadiums/{id}`: Supprimer un stade.

- **Événements**
    - `GET /api/events/{id}`: Obtenir un événement par son ID.
    - `POST /api/events`: Ajouter un nouvel événement.
    - `PUT /api/events/{id}`: Mettre à jour un événement existant.
    - `DELETE /api/events/{id}`: Supprimer un événement.


Ce projet a été réalisé par RAIS Adel et SECEMBER Robin.

Ceci est un aperçu de la documentation de l'API. Pour plus de détails sur chaque endpoint et sur la façon d'utiliser l'API, veuillez consulter la définition complète de l'API. Si vous avez des questions ou des commentaires, n'hésitez pas à nous contacter. Merci de votre intérêt pour notre API de gestion de la billetterie des Jeux Olympiques.
