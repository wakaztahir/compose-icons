package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.CarRepair: ImageVector
    get() {
        if (_carRepair != null) {
            return _carRepair!!
        }
        _carRepair = Builder(name = "CarRepair", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineTo(8.69f)
                curveToRelative(0.0f, 0.0f, -1.34f, -4.03f, -1.56f, -4.69f)
                curveToRelative(-0.05f, -0.16f, -0.12f, -0.29f, -0.19f, -0.4f)
                curveToRelative(-0.02f, -0.02f, -0.03f, -0.04f, -0.05f, -0.07f)
                curveTo(16.82f, 3.01f, 16.28f, 3.0f, 16.28f, 3.0f)
                horizontalLineTo(7.72f)
                curveToRelative(0.0f, 0.0f, -0.54f, 0.01f, -0.92f, 0.54f)
                curveTo(6.78f, 3.56f, 6.77f, 3.58f, 6.75f, 3.6f)
                curveTo(6.68f, 3.71f, 6.61f, 3.84f, 6.56f, 4.0f)
                curveTo(6.34f, 4.66f, 5.0f, 8.69f, 5.0f, 8.69f)
                verticalLineTo(15.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveTo(6.55f, 16.0f, 7.0f, 15.55f, 7.0f, 15.0f)
                close()
                moveTo(9.0f, 11.5f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveTo(9.55f, 11.5f, 9.0f, 11.5f)
                close()
                moveTo(15.0f, 11.5f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveTo(15.55f, 11.5f, 15.0f, 11.5f)
                close()
                moveTo(8.33f, 5.0f)
                horizontalLineToRelative(7.34f)
                lineToRelative(0.23f, 0.69f)
                lineTo(16.33f, 7.0f)
                horizontalLineTo(7.67f)
                lineTo(8.33f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 18.01f)
                lineTo(4.0f, 18.01f)
                curveTo(4.0f, 18.55f, 4.45f, 19.0f, 4.99f, 19.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(2.01f)
                curveToRelative(0.0f, 0.55f, 0.45f, 0.99f, 0.99f, 0.99f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.55f, 0.0f, 0.99f, -0.45f, 0.99f, -0.99f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(6.01f)
                curveToRelative(0.55f, 0.0f, 0.99f, -0.45f, 0.99f, -0.99f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -0.99f, -0.99f, -0.99f)
                horizontalLineTo(4.99f)
                curveTo(4.45f, 17.01f, 4.0f, 17.46f, 4.0f, 18.01f)
                close()
            }
        }
        .build()
        return _carRepair!!
    }

private var _carRepair: ImageVector? = null
