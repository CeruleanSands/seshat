package ch.ceruleansands.seshat.loader;

import ch.ceruleansands.seshat.Diagram;
import ch.ceruleansands.seshat.language.java.SaveFormatException;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Represent a diagram loader specific to a language.
 * @author Thomsch
 */
public interface LanguageDiagramLoader {

    /**
     * Loads a diagram from a {@link BufferedReader}.
     * This method is not expected to close the <code>bufferedReader</code>.
     * @param bufferedReader The buffer containing the description of the diagram to load
     * @return A new instance of a {@link Diagram} specific to the language of the loader built from the description contained in the <code>bufferedReader</code>
     */
    Diagram loadFromBuffer(BufferedReader bufferedReader) throws IOException, SaveFormatException;
}