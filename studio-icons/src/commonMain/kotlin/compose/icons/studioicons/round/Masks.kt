package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Masks: ImageVector
    get() {
        if (_masks != null) {
            return _masks!!
        }
        _masks = Builder(name = "Masks", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 6.0f)
                curveToRelative(-1.31f, 0.0f, -2.37f, 1.01f, -2.48f, 2.3f)
                curveTo(15.14f, 7.8f, 14.18f, 6.5f, 12.0f, 6.5f)
                curveToRelative(-2.19f, 0.0f, -3.14f, 1.3f, -5.02f, 1.8f)
                curveTo(6.87f, 7.02f, 5.81f, 6.0f, 4.5f, 6.0f)
                curveTo(3.12f, 6.0f, 2.0f, 7.12f, 2.0f, 8.5f)
                verticalLineTo(9.0f)
                curveToRelative(0.0f, 6.0f, 3.6f, 7.81f, 6.52f, 7.98f)
                curveTo(9.53f, 17.62f, 10.72f, 18.0f, 12.0f, 18.0f)
                reflectiveCurveToRelative(2.47f, -0.38f, 3.48f, -1.02f)
                curveTo(18.4f, 16.81f, 22.0f, 15.0f, 22.0f, 9.0f)
                verticalLineTo(8.5f)
                curveTo(22.0f, 7.12f, 20.88f, 6.0f, 19.5f, 6.0f)
                close()
                moveTo(3.5f, 9.0f)
                verticalLineTo(8.5f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.28f, 0.38f, 2.47f, 1.01f, 3.48f)
                curveTo(4.99f, 14.27f, 3.5f, 12.65f, 3.5f, 9.0f)
                close()
                moveTo(14.3f, 11.01f)
                curveToRelative(-0.4f, -0.17f, -0.72f, -0.36f, -1.01f, -0.53f)
                curveTo(12.83f, 10.2f, 12.49f, 10.0f, 12.0f, 10.0f)
                curveToRelative(-0.49f, 0.0f, -0.84f, 0.2f, -1.31f, 0.48f)
                curveToRelative(-0.28f, 0.17f, -0.6f, 0.35f, -0.98f, 0.51f)
                curveTo(9.37f, 11.14f, 9.0f, 10.91f, 9.0f, 10.54f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.2f, 0.11f, -0.38f, 0.29f, -0.45f)
                curveToRelative(0.34f, -0.14f, 0.62f, -0.31f, 0.88f, -0.46f)
                curveTo(10.72f, 9.3f, 11.23f, 9.0f, 12.0f, 9.0f)
                reflectiveCurveToRelative(1.27f, 0.3f, 1.8f, 0.62f)
                curveToRelative(0.27f, 0.16f, 0.55f, 0.33f, 0.9f, 0.48f)
                curveToRelative(0.18f, 0.08f, 0.29f, 0.26f, 0.29f, 0.45f)
                curveTo(15.0f, 10.91f, 14.63f, 11.15f, 14.3f, 11.01f)
                close()
                moveTo(20.5f, 9.0f)
                curveToRelative(0.0f, 3.65f, -1.49f, 5.27f, -3.01f, 5.98f)
                curveToRelative(0.64f, -1.01f, 1.01f, -2.2f, 1.01f, -3.48f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _masks!!
    }

private var _masks: ImageVector? = null
