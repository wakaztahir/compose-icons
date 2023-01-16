package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.AppleKeyboardCommand: ImageVector
    get() {
        if (_appleKeyboardCommand != null) {
            return _appleKeyboardCommand!!
        }
        _appleKeyboardCommand = Builder(name = "AppleKeyboardCommand", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 2.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 10.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 18.0f, 2.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 22.0f, 6.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 18.0f, 10.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(18.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 22.0f, 18.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 18.0f, 22.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 14.0f, 18.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(18.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 6.0f, 22.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 2.0f, 18.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 6.0f, 14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(6.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 2.0f, 6.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 6.0f, 2.0f)
                moveTo(16.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.0f, 16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(18.0f)
                moveTo(14.0f, 10.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.0f)
                moveTo(6.0f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.0f, 18.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(6.0f)
                moveTo(8.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.0f)
                moveTo(18.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 16.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _appleKeyboardCommand!!
    }

private var _appleKeyboardCommand: ImageVector? = null