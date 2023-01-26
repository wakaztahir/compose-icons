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

public val SharpGroup.DynamicForm: ImageVector
    get() {
        if (_dynamicForm != null) {
            return _dynamicForm!!
        }
        _dynamicForm = Builder(name = "DynamicForm", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 20.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(7.0f)
                lineToRelative(-2.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(17.0f, 20.0f)
                close()
                moveTo(15.0f, 13.0f)
                verticalLineToRelative(7.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(6.25f, 15.75f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(15.75f)
                close()
                moveTo(13.0f, 4.0f)
                verticalLineToRelative(7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(6.25f, 6.75f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(6.75f)
                close()
            }
        }
        .build()
        return _dynamicForm!!
    }

private var _dynamicForm: ImageVector? = null