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

public val SharpGroup.AddLocation: ImageVector
    get() {
        if (_addLocation != null) {
            return _addLocation!!
        }
        _addLocation = Builder(name = "AddLocation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(6.0f)
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
        return _addLocation!!
    }

private var _addLocation: ImageVector? = null
