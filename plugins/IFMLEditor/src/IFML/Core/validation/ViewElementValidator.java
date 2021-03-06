/**
 *
 * $Id$
 */
package IFML.Core.validation;

import IFML.Core.ActivationExpression;
import IFML.Core.ViewContainer;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link IFML.Core.ViewElement}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ViewElementValidator {
	boolean validate();

	boolean validateViewElementEvents(EList value);
	boolean validateActivationExpression(ActivationExpression value);
	boolean validateViewContainer(ViewContainer value);
}
