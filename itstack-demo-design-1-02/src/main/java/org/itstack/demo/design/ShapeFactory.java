package org.itstack.demo.design;

import org.itstack.demo.design.shape.RectShape;
import org.itstack.demo.design.shape.Shape;
import org.itstack.demo.design.shape.TriangleShape;

/**
 * @author tong.huo
 * @date 2021/10/12 3:37 下午
 */
public class ShapeFactory {

    public Shape drawShape(Integer shapeType) {
        switch (shapeType) {
            case 1: {
                return new TriangleShape();
            }
            case 2: {
                return new RectShape();
            }
            default:
                return null;
        }
    }
}
