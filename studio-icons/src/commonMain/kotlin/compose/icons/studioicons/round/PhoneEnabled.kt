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

public val RoundGroup.PhoneEnabled: ImageVector
    get() {
        if (_phoneEnabled != null) {
            return _phoneEnabled!!
        }
        _phoneEnabled = Builder(name = "PhoneEnabled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.78f, 15.27f)
                lineToRelative(2.54f, -0.29f)
                curveToRelative(0.61f, -0.07f, 1.21f, 0.14f, 1.64f, 0.57f)
                lineToRelative(1.84f, 1.84f)
                curveToRelative(2.83f, -1.44f, 5.15f, -3.75f, 6.59f, -6.59f)
                lineToRelative(-1.85f, -1.85f)
                curveToRelative(-0.43f, -0.43f, -0.64f, -1.03f, -0.57f, -1.64f)
                lineToRelative(0.29f, -2.52f)
                curveToRelative(0.12f, -1.01f, 0.97f, -1.77f, 1.99f, -1.77f)
                horizontalLineToRelative(1.73f)
                curveToRelative(1.13f, 0.0f, 2.07f, 0.94f, 2.0f, 2.07f)
                curveToRelative(-0.53f, 8.54f, -7.36f, 15.36f, -15.89f, 15.89f)
                curveToRelative(-1.13f, 0.07f, -2.07f, -0.87f, -2.07f, -2.0f)
                verticalLineToRelative(-1.73f)
                curveTo(3.01f, 16.24f, 3.77f, 15.39f, 4.78f, 15.27f)
                close()
            }
        }
        .build()
        return _phoneEnabled!!
    }

private var _phoneEnabled: ImageVector? = null
