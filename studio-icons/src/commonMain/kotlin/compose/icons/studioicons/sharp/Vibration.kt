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

public val SharpGroup.Vibration: ImageVector
    get() {
        if (_vibration != null) {
            return _vibration!!
        }
        _vibration = Builder(name = "Vibration", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                lineTo(2.0f, 9.0f)
                lineTo(0.0f, 9.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(3.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                lineTo(5.0f, 7.0f)
                lineTo(3.0f, 7.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(22.0f, 9.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 9.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(19.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                lineTo(21.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(18.0f, 3.0f)
                lineTo(6.0f, 3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(12.0f)
                lineTo(18.0f, 3.0f)
                close()
                moveTo(16.0f, 19.0f)
                lineTo(8.0f, 19.0f)
                lineTo(8.0f, 5.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(14.0f)
                close()
            }
        }
        .build()
        return _vibration!!
    }

private var _vibration: ImageVector? = null
