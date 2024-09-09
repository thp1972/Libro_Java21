package LibroJava.Capitolo8;

// interfaccia "sigillata" solo le interfacce IDrawable2D e IDrawable3D
// possono estenderla
sealed interface IDrawable permits IDrawable2D, IDrawable3D {}

// interfaccia "sigillata" solo le classi Square e Rectangle
// possono implementarla
// estensione legittima
sealed interface IDrawable2D extends IDrawable permits Square, Rectangle {}

// interfaccia "sigillata" solo le classi Cube e Sphere
// possono implementarla
// estensione legittima
sealed interface IDrawable3D extends IDrawable permits Cube, Sphere {}

// implementazioni legittime
final class Square implements IDrawable2D {}
final class Rectangle implements IDrawable2D {}

// implmentazioni legittime
final class Cube implements IDrawable3D {}
final class Sphere implements IDrawable3D {}

public class Snippet_8_8
{
}
