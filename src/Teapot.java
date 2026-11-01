import java.lang.foreign.Arena;
import java.lang.foreign.SegmentAllocator;

import org.freeglut.*;
import static org.freeglut.freeglut_h.*;

public class Teapot {

    Teapot(SegmentAllocator allocator) {
        // background'ni reset qiliw
        glClearColor(0f, 0f, 0f, 0f);
        // Model (Object coordinate'lar), View (Camera coordinate'lar), Projection (Screen coordinate'lar)
        glMatrixMode(GL_PROJECTION);
        gluPerspective(40.0, 1.0, 1.0, 10.0);
        glMatrixMode(GL_MODELVIEW);
        gluLookAt(0.0, 0.0, 5.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.);
    }

    void display() {
        glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
        glPushMatrix();
        glColor3f(0.0f, 1.0f, 0.0f);
        glRotatef(10, 0.0f, 0.0f, 1.0f);
        glRotatef(10, 0.0f, 1.0f, 0.0f);
        glutWireTeapot(1);
        glPopMatrix();
        glutSwapBuffers();
    }

    static void main(String[] args) {
        try (var arena = Arena.ofConfined()) {
            var argc = arena.allocateFrom(C_INT, 0);
            glutInit(argc, argc);
            glutInitDisplayMode(GLUT_DOUBLE | GLUT_RGB | GLUT_DEPTH);
            glutInitWindowSize(500, 500);
            glutCreateWindow(arena.allocateFrom("Hello Panama!"));
            var teapot = new Teapot(arena);
            var displayStub = glutDisplayFunc$callback.allocate(teapot::display, arena);
            glutDisplayFunc(displayStub);
            glutMainLoop();
        }
    }
}

