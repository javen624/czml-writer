package cesiumlanguagewriter;


import agi.foundation.compatibility.*;
import agi.foundation.compatibility.DisposeHelper;
import agi.foundation.compatibility.Func1;
import agi.foundation.compatibility.Lazy;
import cesiumlanguagewriter.advanced.*;
import cesiumlanguagewriter.ColorCesiumWriter;
import cesiumlanguagewriter.DoubleCesiumWriter;
import java.awt.Color;
import java.util.List;
import javax.annotation.Nonnull;

/**
 *  
 Writes a {@code PolylineGlowMaterial} to a {@link CesiumOutputStream}.  A {@code PolylineGlowMaterial} is a material that fills the surface of a line with a glowing color.
 

 */
@SuppressWarnings( {
        "unused",
        "deprecation",
        "serial"
})
public class PolylineGlowMaterialCesiumWriter extends CesiumPropertyWriter<PolylineGlowMaterialCesiumWriter> {
    /**
    *  
    The name of the {@code color} property.
    

    */
    public static final String ColorPropertyName = "color";
    /**
    *  
    The name of the {@code glowPower} property.
    

    */
    public static final String GlowPowerPropertyName = "glowPower";
    private Lazy<ColorCesiumWriter> m_color = new Lazy<cesiumlanguagewriter.ColorCesiumWriter>(new Func1<cesiumlanguagewriter.ColorCesiumWriter>() {
        public cesiumlanguagewriter.ColorCesiumWriter invoke() {
            return new ColorCesiumWriter(ColorPropertyName);
        }
    }, false);
    private Lazy<DoubleCesiumWriter> m_glowPower = new Lazy<cesiumlanguagewriter.DoubleCesiumWriter>(new Func1<cesiumlanguagewriter.DoubleCesiumWriter>() {
        public cesiumlanguagewriter.DoubleCesiumWriter invoke() {
            return new DoubleCesiumWriter(GlowPowerPropertyName);
        }
    }, false);

    /**
    *  
    Initializes a new instance.
    
    

    * @param propertyName The name of the property.
    */
    public PolylineGlowMaterialCesiumWriter(@Nonnull String propertyName) {
        super(propertyName);
    }

    /**
    *  
    Initializes a new instance as a copy of an existing instance.
    
    

    * @param existingInstance The existing instance to copy.
    */
    protected PolylineGlowMaterialCesiumWriter(@Nonnull PolylineGlowMaterialCesiumWriter existingInstance) {
        super(existingInstance);
    }

    /**
    *  
    
    Copies this instance and returns the copy.
    
    

    * @return The copy.
    */
    @Override
    public PolylineGlowMaterialCesiumWriter clone() {
        return new PolylineGlowMaterialCesiumWriter(this);
    }

    /**
    *  Gets the writer for the {@code color} property.  The returned instance must be opened by calling the {@link CesiumElementWriter#open} method before it can be used for writing.  The {@code color} property defines the color of the surface.
    

    */
    @Nonnull
    public final ColorCesiumWriter getColorWriter() {
        return m_color.getValue();
    }

    /**
    *  
    Opens and returns the writer for the {@code color} property.  The {@code color} property defines the color of the surface.
    

    */
    @Nonnull
    public final ColorCesiumWriter openColorProperty() {
        openIntervalIfNecessary();
        return this.<ColorCesiumWriter> openAndReturn(getColorWriter());
    }

    /**
    *  
    Writes a value for the {@code color} property as a {@code rgba} value.  The {@code color} property specifies the color of the surface.
    
    

    * @param color The color.
    */
    public final void writeColorProperty(@Nonnull Color color) {
        {
            cesiumlanguagewriter.ColorCesiumWriter writer = openColorProperty();
            try {
                writer.writeRgba(color);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code color} property as a {@code rgba} value.  The {@code color} property specifies the color of the surface.
    
    
    
    
    

    * @param red The red component in the range 0 to 255.
    * @param green The green component in the range 0 to 255.
    * @param blue The blue component in the range 0 to 255.
    * @param alpha The alpha component in the range 0 to 255.
    */
    public final void writeColorProperty(int red, int green, int blue, int alpha) {
        {
            cesiumlanguagewriter.ColorCesiumWriter writer = openColorProperty();
            try {
                writer.writeRgba(red, green, blue, alpha);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code color} property as a {@code rgba} value.  The {@code color} property specifies the color of the surface.
    
    
    

    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    */
    public final void writeColorProperty(List<JulianDate> dates, List<Color> values) {
        {
            cesiumlanguagewriter.ColorCesiumWriter writer = openColorProperty();
            try {
                writer.writeRgba(dates, values);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code color} property as a {@code rgba} value.  The {@code color} property specifies the color of the surface.
    
    
    
    
    

    * @param dates The dates at which the value is specified.
    * @param colors The color corresponding to each date.
    * @param startIndex The index of the first element to write.
    * @param length The number of elements to write.
    */
    public final void writeColorProperty(List<JulianDate> dates, List<Color> colors, int startIndex, int length) {
        {
            cesiumlanguagewriter.ColorCesiumWriter writer = openColorProperty();
            try {
                writer.writeRgba(dates, colors, startIndex, length);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code color} property as a {@code rgbaf} value.  The {@code color} property specifies the color of the surface.
    
    

    * @param color The color.
    */
    public final void writeColorPropertyRgbaf(@Nonnull Color color) {
        {
            cesiumlanguagewriter.ColorCesiumWriter writer = openColorProperty();
            try {
                writer.writeRgbaf(color);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code color} property as a {@code rgbaf} value.  The {@code color} property specifies the color of the surface.
    
    
    
    
    

    * @param red The red component in the range 0 to 1.0.
    * @param green The green component in the range 0 to 1.0.
    * @param blue The blue component in the range 0 to 1.0.
    * @param alpha The alpha component in the range 0 to 1.0.
    */
    public final void writeColorPropertyRgbaf(float red, float green, float blue, float alpha) {
        {
            cesiumlanguagewriter.ColorCesiumWriter writer = openColorProperty();
            try {
                writer.writeRgbaf(red, green, blue, alpha);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code color} property as a {@code rgbaf} value.  The {@code color} property specifies the color of the surface.
    
    
    

    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    */
    public final void writeColorPropertyRgbaf(List<JulianDate> dates, List<Color> values) {
        {
            cesiumlanguagewriter.ColorCesiumWriter writer = openColorProperty();
            try {
                writer.writeRgbaf(dates, values);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code color} property as a {@code rgbaf} value.  The {@code color} property specifies the color of the surface.
    
    
    
    
    

    * @param dates The dates at which the value is specified.
    * @param colors The color corresponding to each date.
    * @param startIndex The index of the first element to write.
    * @param length The number of elements to write.
    */
    public final void writeColorPropertyRgbaf(List<JulianDate> dates, List<Color> colors, int startIndex, int length) {
        {
            cesiumlanguagewriter.ColorCesiumWriter writer = openColorProperty();
            try {
                writer.writeRgbaf(dates, colors, startIndex, length);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code color} property as a {@code reference} value.  The {@code color} property specifies the color of the surface.
    
    

    * @param value The reference.
    */
    public final void writeColorPropertyReference(Reference value) {
        {
            cesiumlanguagewriter.ColorCesiumWriter writer = openColorProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code color} property as a {@code reference} value.  The {@code color} property specifies the color of the surface.
    
    

    * @param value The earliest date of the interval.
    */
    public final void writeColorPropertyReference(String value) {
        {
            cesiumlanguagewriter.ColorCesiumWriter writer = openColorProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code color} property as a {@code reference} value.  The {@code color} property specifies the color of the surface.
    
    
    

    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyName The property on the referenced object.
    */
    public final void writeColorPropertyReference(String identifier, String propertyName) {
        {
            cesiumlanguagewriter.ColorCesiumWriter writer = openColorProperty();
            try {
                writer.writeReference(identifier, propertyName);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code color} property as a {@code reference} value.  The {@code color} property specifies the color of the surface.
    
    
    

    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
    */
    public final void writeColorPropertyReference(String identifier, String[] propertyNames) {
        {
            cesiumlanguagewriter.ColorCesiumWriter writer = openColorProperty();
            try {
                writer.writeReference(identifier, propertyNames);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  Gets the writer for the {@code glowPower} property.  The returned instance must be opened by calling the {@link CesiumElementWriter#open} method before it can be used for writing.  The {@code glowPower} property defines the strength of the glow.
    

    */
    @Nonnull
    public final DoubleCesiumWriter getGlowPowerWriter() {
        return m_glowPower.getValue();
    }

    /**
    *  
    Opens and returns the writer for the {@code glowPower} property.  The {@code glowPower} property defines the strength of the glow.
    

    */
    @Nonnull
    public final DoubleCesiumWriter openGlowPowerProperty() {
        openIntervalIfNecessary();
        return this.<DoubleCesiumWriter> openAndReturn(getGlowPowerWriter());
    }

    /**
    *  
    Writes a value for the {@code glowPower} property as a {@code number} value.  The {@code glowPower} property specifies the strength of the glow.
    
    

    * @param value The value.
    */
    public final void writeGlowPowerProperty(double value) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openGlowPowerProperty();
            try {
                writer.writeNumber(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code glowPower} property as a {@code number} value.  The {@code glowPower} property specifies the strength of the glow.
    
    
    

    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    */
    public final void writeGlowPowerProperty(List<JulianDate> dates, List<Double> values) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openGlowPowerProperty();
            try {
                writer.writeNumber(dates, values);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code glowPower} property as a {@code number} value.  The {@code glowPower} property specifies the strength of the glow.
    
    
    
    
    

    * @param dates The dates at which the value is specified.
    * @param values The value corresponding to each date.
    * @param startIndex The index of the first element to write.
    * @param length The number of elements to write.
    */
    public final void writeGlowPowerProperty(List<JulianDate> dates, List<Double> values, int startIndex, int length) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openGlowPowerProperty();
            try {
                writer.writeNumber(dates, values, startIndex, length);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code glowPower} property as a {@code reference} value.  The {@code glowPower} property specifies the strength of the glow.
    
    

    * @param value The reference.
    */
    public final void writeGlowPowerPropertyReference(Reference value) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openGlowPowerProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code glowPower} property as a {@code reference} value.  The {@code glowPower} property specifies the strength of the glow.
    
    

    * @param value The earliest date of the interval.
    */
    public final void writeGlowPowerPropertyReference(String value) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openGlowPowerProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code glowPower} property as a {@code reference} value.  The {@code glowPower} property specifies the strength of the glow.
    
    
    

    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyName The property on the referenced object.
    */
    public final void writeGlowPowerPropertyReference(String identifier, String propertyName) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openGlowPowerProperty();
            try {
                writer.writeReference(identifier, propertyName);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code glowPower} property as a {@code reference} value.  The {@code glowPower} property specifies the strength of the glow.
    
    
    

    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
    */
    public final void writeGlowPowerPropertyReference(String identifier, String[] propertyNames) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openGlowPowerProperty();
            try {
                writer.writeReference(identifier, propertyNames);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }
}