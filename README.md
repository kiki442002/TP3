# Github:

https://github.com/kiki442002/TP3

# TP3

### Etape 5:

#### HIbernate

C'est la dépendance qui permet de faire le lien entre la base de données et l'application via des classes JAVA. C'est la
couche ORM de l'application, il gére la persitance des données.

#### JPA

JPA est une interface de programmation JAVA qui permet de faire la même chose que Hibernate, mais avec moins de
fonctionnalités. Hibernate utilise entre autre JPA.

#### H2

H2 est un système de gestion de base de données relationnelle écrit en JAVA. Il est utilisé majoritairement pour les
tests unitaires ou les petits projets. H2 est une base de données embarquée, c'est à dire qu'elle est intégrée à une
autre application.

#### DevTools

cette dépandence regroupe des outils qui permettent de faciliter le développement d'une application. Cela peut être pour
déboguer, inspecter, émuler, modifier le code ou l'état de l'application etc...

#### Thymeleaf

Thymeleaf est un moteur de template JAVA. Il permet de générer des pages HTML à partir de templates. Il est utilisé dans
notre projet pour faire la vue. Il permet de rendre cette dernière dynamique.

#### Web

Web est une dépendance qui permet de faire une application web. Elle permet de faire le lien entre le controlleur et la
vue (HTML), ainsi que de participer à la dynamisation du site ou de l'application.

### Etape 13:

#### 1

C'est grâce à l'annotation @GetMapping("/greeting") présent dans le controlleur que l'on peut accéder à la méthode
greeting() via l'url /greeting.

#### 2

C'est le return du controlleur qui permet de choisir le fichier html à afficher. Dans notre cas, c'est le fichier
greeting.html qui est affiché.

#### 3

Nous pouvons envoyer le nom de la personne à l'aide de l'url /greeting?name=nomDeLaPersonne. Le nom de la personne est
alors récupéré dans la méthode greeting() grâce à l'annotation @RequestParam(name="name", required=false, defaultValue="
World").
Les valeur entrée après le ? dans l'url correspondent a des paramètres GET de requètes HTTP.

### Etape 17:

La table Address est apparue dans la base de données. Elle contient les attributs de la classe Address.

### Etape 18:

La table est apparue dans la base de données grâce à l'annotation @Entity présente dans la classe Address. L'annotaion
@Id permet de définir l'attribut id comme clé primaire de la table, et l'annotation @GeneratedValue permet de génerer
automatiquement la valeur de l'attribut id.

### Etape 20:

Toutes les lignes du fichier sql sont apparues dans la table adresse. Les requètes sql se sont bien exécutées au
lancement de l'application.

### Etape 22:

L'annotation Autowired permet de faire l'injection de dépendance de la classe défini. Elle permet de faire le lien entre
le controlleur et le repository.

### Etape 30:

J'ai utilisé un lien dans une balise link, comme cela est recommandé dans la documentation de Bootstrap. J'ai crée un
fragmenent liée au lien
pour eviter de répéter le code.

# TP4

### Etape 6:

#### 1

Il est nécessaire d'obtenir une clé d'API pour utiliser l'API de MeteoConcept. Pour cela, il faut s'inscrire sur le site
internet et demander une clé d'API.

#### 2

J'ai appeler l'url https://api.meteo-concept.com/api/forecast/daily, qui permet de recuperer la météo jour par jour.

#### 3

Pour passer las paramètre, il suffit de mettre un ? après l'url, puis de mettre les paramètres sous la forme nom=valeur
chaque paramètre étant séparé par un &. Il s'agit d'une requète GET.

#### 4

Il s'agit des valeurs tmin et tmax qui correspondent aux températures minimales et maximales, présent dans la requête
JSON de l'API. La prévision se situe dans la valeur weather de forecast.

