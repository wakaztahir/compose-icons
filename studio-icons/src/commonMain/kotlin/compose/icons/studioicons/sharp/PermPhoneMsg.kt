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

public val SharpGroup.PermPhoneMsg: ImageVector
    get() {
        if (_permPhoneMsg != null) {
            return _permPhoneMsg!!
        }
        _permPhoneMsg = Builder(name = "PermPhoneMsg", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                verticalLineToRelative(10.0f)
                lineToRelative(3.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                lineTo(21.0f, 3.0f)
                close()
                moveTo(13.21f, 17.37f)
                curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f)
                lineToRelative(2.53f, -2.53f)
                lineTo(8.54f, 3.0f)
                lineTo(3.03f, 3.0f)
                curveTo(2.45f, 13.18f, 10.82f, 21.55f, 21.0f, 20.97f)
                verticalLineToRelative(-5.51f)
                lineToRelative(-5.27f, -0.61f)
                lineToRelative(-2.52f, 2.52f)
                close()
            }
        }
        .build()
        return _permPhoneMsg!!
    }

private var _permPhoneMsg: ImageVector? = null
