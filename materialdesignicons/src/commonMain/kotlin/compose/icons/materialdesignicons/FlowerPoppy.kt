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

public val MaterialDesignIcons.FlowerPoppy: ImageVector
    get() {
        if (_flowerPoppy != null) {
            return _flowerPoppy!!
        }
        _flowerPoppy = Builder(name = "FlowerPoppy", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 12.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 22.0f, 8.5f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 15.5f, 2.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 12.0f, 5.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 8.5f, 2.0f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 2.0f, 8.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 5.5f, 12.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 2.0f, 15.5f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 8.5f, 22.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 12.0f, 18.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 15.5f, 22.0f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 22.0f, 15.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 18.5f, 12.0f)
                moveTo(12.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 16.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 16.0f)
                moveTo(14.5f, 12.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.0f, 14.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 9.5f, 12.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.0f, 9.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 14.5f, 12.0f)
                close()
            }
        }
        .build()
        return _flowerPoppy!!
    }

private var _flowerPoppy: ImageVector? = null