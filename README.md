# Github:
https://github.com/kiki442002/TP3
# TP3

### Etape 5:

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

