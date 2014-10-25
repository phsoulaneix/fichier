package com.formation.ressource;

import java.io.File;

/**
 * The Interface TextFileHandler.
 */
public interface TextFileHandler {

	/**
	 * Read show and write file.
	 *
	 * @param file
	 *            the file
	 * @param file1
	 *            the file1
	 */
	public abstract void readShowAndWriteFile(File file, File file1);

	/**
	 * One over two.
	 *
	 * @param file
	 *            the file
	 */
	public abstract void oneOverTwo(File file);
}