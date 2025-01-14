package teapot_rocket.components.inner;

import teapot_rocket.components.Component;
import teapot_rocket.utils.ComponentBase;

/**
 * Represents an inner component used in rocket construction.
 *
 * <p>
 * This class extends {@link Component} and serves as a base class for various
 * internal components used within
 * {@link teapot_rocket.components.body.BodyComponent} instances.
 * </p>
 *
 * <p>
 * Inner components are critical elements inside a rocket and can represent
 * specialized components such as motor mounts.
 * </p>
 *
 * <p>
 * Subclasses of {@code InnerComponent} are expected to implement specific
 * types of inner components with unique functionalities.
 * </p>
 *
 * @author Gleb Kiva
 * @see teapot_rocket.components.body.BodyComponent
 */
public abstract class InnerComponent extends Component {
    /**
     * Constructs an inner component with the specified base information.
     *
     * @param componentBase The base information of the inner component.
     * @throws IllegalArgumentException If the componentBase is null.
     */
    public InnerComponent(final ComponentBase componentBase)
            throws IllegalArgumentException {
        super(componentBase);
    }

    /**
     * Returns a string representation of the inner component.
     *
     * @return A string representing the inner component.
     */
    @Override
    public String toString() {
        return String.format("| | |_Внутренний%s %s\n", name);
    }
}
