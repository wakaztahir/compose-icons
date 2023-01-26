package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.SignalCellular0Bar: ImageVector
    get() {
        if (_signalCellular0Bar != null) {
            return _signalCellular0Bar!!
        }
        _signalCellular0Bar = Builder(name = "SignalCellular0Bar", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 22.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(2.0f)
                lineTo(2.0f, 22.0f)
                close()
                moveTo(20.0f, 20.0f)
                horizontalLineTo(6.83f)
                lineTo(20.0f, 6.83f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _signalCellular0Bar!!
    }

private var _signalCellular0Bar: ImageVector? = null
