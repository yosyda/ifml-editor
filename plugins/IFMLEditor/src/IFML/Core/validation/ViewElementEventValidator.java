/**
 *
 * $Id$
 */
package IFML.Core.validation;

import IFML.Core.ViewElement;

/**
 * A sample validator interface for {@link IFML.Core.ViewElementEvent}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ViewElementEventValidator {
	boolean validate();

	boolean validateViewElement(ViewElement value);
}