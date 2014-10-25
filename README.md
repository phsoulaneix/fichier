Fichier
=======
Les classes développées doivent, en plus de remplir les fonctionnalités demandées, gérer les différents cas d’erreurs et exceptions standards. Chacune des classes devra implémenter un constructeur par défaut. Le nom complet de chaque classe sera fourni.

1) Manipulation du système de fichiers
--------------------
Créer une classe qui implémente l’interface com.formation.ressource.FileSystemHandler.

La méthode folderExists test si le fichier cible existe et si il s’agit d’un fichier

La méthode showFolderTree affiche l’ensemble des descendants du dossier passé en paramètre. Si le paramètre showOnlyFolders est à true, la méthode se contente d’afficher les dossiers.

La méthode moveFileToParentFolder permet de réaliser la fonctionnalité suivante : 
A partir d’un fichier donné :
	- créer un répertoire qui porte le même nom que le fichier
	- copier le fichier dans le répertoire nouvellement créé
	- le renommer en “formation.txt”
par exemple : 
	<my_path>/file.txt devient <my_path>/file.txt/formation.txt
	
2) Reader/Writer
--------------------
Créer une classe qui implémente com.formation.ressource.TextFileHandler.
La méthode readShowAndWriteFile lit le fichier passé en paramètre ligne par ligne et l’écrit dans le fichier cible.
La méthode oneOverTwo permet d’écrire une ligne sur 2 du fichier passé en paramètre dans la sortie standard..

3) Streams
--------------------
Créer une classe qui implémente com.formation.ressource.StreamHandler

La méthode stringToFile permet d’écrire la chaîne de caractères passée en paramètres dans un fichier.

La méthode createCountInputStream permet de compter le nombre de lectures effectuées dans l’Inpustream source.

4) Sérialisation
--------------------
Créer une classe qui implémente l’interface com.formation.ressource.ObjectSerlialization.
La méthode storeObjectIntoFile permet de sérialiser un objet java dans un fichier binaire
La méthode getObjectFromFile permet de lire un objet java sérialisé dans un fichier binaire