# TP3
### Etape 13:
#### 1
C'est grâce à l'annotation @GetMapping("/greeting") présent dans le controlleur que l'on peut accéder à la méthode greeting() via l'url /greeting.

#### 2
C'est le return du controlleur qui permet de choisir le fichier html à afficher. Dans notre cas, c'est le fichier greeting.html qui est affiché.

#### 3 
Nous pouvons envoyer le nom de la personne à l'aide de l'url /greeting?name=nomDeLaPersonne. Le nom de la personne est alors récupéré dans la méthode greeting() grâce à l'annotation @RequestParam(name="name", required=false, defaultValue="World").
Les valeur entrée après le ? dans l'url correspondent a des paramètres GET de requètes HTTP.

#### 4
