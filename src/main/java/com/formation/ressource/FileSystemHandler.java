package com.formation.ressource;

/**
 * The Interface FileSystemHandler.
 */
public interface FileSystemHandler {

	/**
	 * Test si le fichier cible existe et si il s’agit d’un fichier.
	 *
	 * @param s
	 *            the file
	 * @return true, if successful
	 */
	public abstract boolean folderExists(String s);

	/**
	 * La méthode showFolderTree affiche l’ensemble des descendants du dossier
	 * passé en paramètre. Si le paramètre showOnlyFolders est à true, la
	 * méthode se contente d’afficher les dossiers.
	 *
	 * @param s
	 *            the file
	 * @param flag
	 *            the flag
	 */
	public abstract void showFolderTree(String s, boolean flag);

	/**
	 * La méthode moveFileToParentFolder permet de réaliser la fonctionnalité
	 * suivante : A partir d’un fichier donné : - créer un répertoire qui porte
	 * le même nom que le fichier - copier le fichier dans le répertoire
	 * nouvellement créé - le renommer en “formation.txt” par exemple :
	 * <my_path>/file.txt devient <my_path>/file.txt/formation.txt
	 *
	 * @param s
	 *            the file
	 */
	public abstract void moveFileToParentFolder(String s);
}
