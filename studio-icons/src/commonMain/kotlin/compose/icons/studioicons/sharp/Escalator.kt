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

public val SharpGroup.Escalator: ImageVector
    get() {
        if (_escalator != null) {
            return _escalator!!
        }
        _escalator = Builder(name = "Escalator", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 3.0f)
                close()
                moveTo(18.5f, 9.0f)
                horizontalLineToRelative(-3.2f)
                lineToRelative(-5.0f, 9.0f)
                horizontalLineTo(5.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.2f)
                lineToRelative(5.0f, -9.0f)
                horizontalLineToRelative(4.8f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _escalator!!
    }

private var _escalator: ImageVector? = null