package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.NotListedLocation: ImageVector
    get() {
        if (_notListedLocation != null) {
            return _notListedLocation!!
        }
        _notListedLocation = Builder(name = "NotListedLocation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.01f, 16.0f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, false, 1.0f, -1.0f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, false, -1.0f, -1.0f)
                curveToRelative(-0.28f, 0.0f, -0.51f, 0.1f, -0.71f, 0.29f)
                curveToRelative(-0.2f, 0.19f, -0.3f, 0.43f, -0.3f, 0.7f)
                reflectiveCurveToRelative(0.1f, 0.51f, 0.29f, 0.71f)
                curveToRelative(0.2f, 0.2f, 0.44f, 0.3f, 0.72f, 0.3f)
                close()
                moveTo(11.13f, 12.34f)
                lineTo(11.13f, 13.0f)
                horizontalLineToRelative(1.85f)
                verticalLineToRelative(-0.42f)
                curveToRelative(0.0f, -0.33f, 0.06f, -0.6f, 0.18f, -0.81f)
                curveToRelative(0.12f, -0.21f, 0.33f, -0.47f, 0.65f, -0.77f)
                curveToRelative(0.4f, -0.38f, 0.68f, -0.75f, 0.89f, -1.09f)
                curveToRelative(0.19f, -0.35f, 0.3f, -0.76f, 0.3f, -1.25f)
                reflectiveCurveToRelative(-0.13f, -0.94f, -0.39f, -1.35f)
                arcToRelative(2.57f, 2.57f, 0.0f, false, false, -1.05f, -0.96f)
                curveTo(13.11f, 6.12f, 12.58f, 6.0f, 12.0f, 6.0f)
                curveToRelative(-0.78f, 0.0f, -1.51f, 0.32f, -2.03f, 0.79f)
                curveTo(9.46f, 7.27f, 9.0f, 7.99f, 9.0f, 9.0f)
                horizontalLineToRelative(1.68f)
                curveToRelative(0.0f, -0.52f, 0.19f, -0.77f, 0.4f, -0.98f)
                curveToRelative(0.21f, -0.2f, 0.58f, -0.3f, 0.96f, -0.3f)
                curveToRelative(0.35f, 0.0f, 0.64f, 0.1f, 0.85f, 0.3f)
                curveToRelative(0.21f, 0.2f, 0.32f, 0.45f, 0.32f, 0.74f)
                curveToRelative(0.0f, 0.24f, -0.06f, 0.46f, -0.19f, 0.64f)
                curveToRelative(-0.13f, 0.19f, -0.33f, 0.41f, -0.61f, 0.66f)
                curveToRelative(-0.48f, 0.42f, -0.81f, 0.79f, -1.0f, 1.12f)
                curveToRelative(-0.19f, 0.33f, -0.28f, 0.71f, -0.28f, 1.16f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(4.2f, 0.0f, 8.0f, 3.22f, 8.0f, 8.2f)
                curveToRelative(0.0f, 3.32f, -2.67f, 7.25f, -8.0f, 11.8f)
                curveToRelative(-5.33f, -4.55f, -8.0f, -8.48f, -8.0f, -11.8f)
                curveTo(4.0f, 5.22f, 7.8f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _notListedLocation!!
    }

private var _notListedLocation: ImageVector? = null
