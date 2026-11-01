package org.freeglut;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

public class freeglut_h {

    public static final ValueLayout.OfInt C_INT = ValueLayout.JAVA_INT;
    public static final ValueLayout.OfDouble C_DOUBLE = ValueLayout.JAVA_DOUBLE;
    public static final AddressLayout C_POINTER = ValueLayout.ADDRESS;

    public static final int GL_PROJECTION = 5889;
    public static final int GL_MODELVIEW = 5888;
    public static final int GL_COLOR_BUFFER_BIT = 16384;
    public static final int GL_DEPTH_BUFFER_BIT = 256;
    public static final int GLUT_DOUBLE = 2;
    public static final int GLUT_RGB = 0;
    public static final int GLUT_DEPTH = 16;

    private static final Linker LINKER = Linker.nativeLinker();
    private static final SymbolLookup OPENGL = SymbolLookup.libraryLookup("opengl32", Arena.global());
    private static final SymbolLookup FREEGLUT = SymbolLookup.libraryLookup("C:\\freeglut\\bin\\x64\\freeglut.dll", Arena.global());

    // C funksiyalari uchun metodlar
    public static void glClearColor(float r, float g, float b, float a) {
        try {
            LINKER.downcallHandle(OPENGL.find("glClearColor").orElseThrow(), FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)).invokeExact(r, g, b, a);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public static void glMatrixMode(int mode) {
        try {
            LINKER.downcallHandle(OPENGL.find("glMatrixMode").orElseThrow(), FunctionDescriptor.ofVoid(C_INT)).invokeExact(mode);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public static void glLoadIdentity() {
        try {
            LINKER.downcallHandle(OPENGL.find("glLoadIdentity").orElseThrow(), FunctionDescriptor.ofVoid()).invokeExact();
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public static void gluPerspective(double fovy, double aspect, double zNear, double zFar) {
        SymbolLookup glu = SymbolLookup.libraryLookup("glu32", Arena.global());
        try {
            LINKER.downcallHandle(glu.find("gluPerspective").orElseThrow(), FunctionDescriptor.ofVoid(C_DOUBLE, C_DOUBLE, C_DOUBLE, C_DOUBLE)).invokeExact(fovy, aspect, zNear, zFar);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public static void gluLookAt(double eyex, double eyey, double eyez, double centerx, double centery, double centerz, double upx, double upy, double upz) {
        SymbolLookup glu = SymbolLookup.libraryLookup("glu32", Arena.global());
        try {
            LINKER.downcallHandle(glu.find("gluLookAt").orElseThrow(), FunctionDescriptor.ofVoid(C_DOUBLE, C_DOUBLE, C_DOUBLE, C_DOUBLE, C_DOUBLE, C_DOUBLE, C_DOUBLE, C_DOUBLE, C_DOUBLE)).invokeExact(eyex, eyey, eyez, centerx, centery, centerz, upx, upy, upz);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public static void glClear(int mask) {
        try {
            LINKER.downcallHandle(OPENGL.find("glClear").orElseThrow(), FunctionDescriptor.ofVoid(C_INT)).invokeExact(mask);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public static void glPushMatrix() {
        try {
            LINKER.downcallHandle(OPENGL.find("glPushMatrix").orElseThrow(), FunctionDescriptor.ofVoid()).invokeExact();
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public static void glPopMatrix() {
        try {
            LINKER.downcallHandle(OPENGL.find("glPopMatrix").orElseThrow(), FunctionDescriptor.ofVoid()).invokeExact();
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public static void glColor3f(float r, float g, float b) {
        try {
            LINKER.downcallHandle(OPENGL.find("glColor3f").orElseThrow(), FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)).invokeExact(r, g, b);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public static void glRotatef(float angle, float x, float y, float z) {
        try {
            LINKER.downcallHandle(OPENGL.find("glRotatef").orElseThrow(), FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)).invokeExact(angle, x, y, z);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public static void glutInit(MemorySegment argc, MemorySegment argv) {
        try {
            LINKER.downcallHandle(FREEGLUT.find("glutInit").orElseThrow(), FunctionDescriptor.ofVoid(C_POINTER, C_POINTER)).invokeExact(argc, argv);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public static void glutInitDisplayMode(int mode) {
        try {
            LINKER.downcallHandle(FREEGLUT.find("glutInitDisplayMode").orElseThrow(), FunctionDescriptor.ofVoid(C_INT)).invokeExact(mode);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public static void glutInitWindowSize(int width, int height) {
        try {
            LINKER.downcallHandle(FREEGLUT.find("glutInitWindowSize").orElseThrow(), FunctionDescriptor.ofVoid(C_INT, C_INT)).invokeExact(width, height);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public static void glutCreateWindow(MemorySegment title) {
        try {
            LINKER.downcallHandle(FREEGLUT.find("glutCreateWindow").orElseThrow(), FunctionDescriptor.of(C_POINTER, C_POINTER)).invokeExact(title);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public static void glutWireTeapot(double size) {
        try {
            LINKER.downcallHandle(FREEGLUT.find("glutWireTeapot").orElseThrow(), FunctionDescriptor.ofVoid(C_DOUBLE)).invokeExact(size);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public static void glutSwapBuffers() {
        try {
            LINKER.downcallHandle(FREEGLUT.find("glutSwapBuffers").orElseThrow(), FunctionDescriptor.ofVoid()).invokeExact();
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public static void glutMainLoop() {
        try {
            LINKER.downcallHandle(FREEGLUT.find("glutMainLoop").orElseThrow(), FunctionDescriptor.ofVoid()).invokeExact();
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    // Darslik 6-o'zgarishiga mos Function Pointer Callback interfeysi (GUIDE.md)
    public static class glutDisplayFunc$callback {
        public interface Function {
            void apply();
        }

        public static MemorySegment allocate(Function fi, Arena arena) {
            try {
                java.lang.reflect.Method method = Function.class.getDeclaredMethod("apply");
                MethodHandle handle = java.lang.invoke.MethodHandles.lookup().unreflect(method).bindTo(fi);
                MemorySegment stub = LINKER.upcallStub(handle, FunctionDescriptor.ofVoid(), arena);
                return stub;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void glutDisplayFunc(MemorySegment displayStub) {
        try {
            LINKER.downcallHandle(FREEGLUT.find("glutDisplayFunc").orElseThrow(), FunctionDescriptor.ofVoid(C_POINTER)).invokeExact(displayStub);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }
}


