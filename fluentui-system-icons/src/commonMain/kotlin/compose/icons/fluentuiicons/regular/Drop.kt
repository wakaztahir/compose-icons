package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Drop: ImageVector
    get() {
        if (_drop != null) {
            return _drop!!
        }
        _drop = Builder(name = "Drop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.4697f, 2.2197f)
                curveTo(11.7626f, 1.9268f, 12.2374f, 1.9268f, 12.5303f, 2.2197f)
                curveTo(12.9334f, 2.6227f, 14.5286f, 4.3474f, 16.0289f, 6.5819f)
                curveTo(17.5084f, 8.7854f, 19.0f, 11.6349f, 19.0f, 14.25f)
                curveTo(19.0f, 16.7736f, 18.2536f, 18.7287f, 16.9556f, 20.0557f)
                curveTo(15.6588f, 21.3814f, 13.8894f, 22.0f, 12.0f, 22.0f)
                curveTo(10.1106f, 22.0f, 8.3412f, 21.3814f, 7.0444f, 20.0557f)
                curveTo(5.7464f, 18.7287f, 5.0f, 16.7736f, 5.0f, 14.25f)
                curveTo(5.0f, 11.6349f, 6.4916f, 8.7854f, 7.9711f, 6.5819f)
                curveTo(9.4714f, 4.3474f, 11.0666f, 2.6227f, 11.4697f, 2.2197f)
                close()
                moveTo(9.2164f, 7.4181f)
                curveTo(7.7584f, 9.5896f, 6.5f, 12.1151f, 6.5f, 14.25f)
                curveTo(6.5f, 16.4764f, 7.1527f, 18.0213f, 8.1167f, 19.0068f)
                curveTo(9.082f, 19.9936f, 10.4377f, 20.5f, 12.0f, 20.5f)
                curveTo(13.5623f, 20.5f, 14.918f, 19.9936f, 15.8833f, 19.0068f)
                curveTo(16.8473f, 18.0213f, 17.5f, 16.4764f, 17.5f, 14.25f)
                curveTo(17.5f, 12.1151f, 16.2416f, 9.5896f, 14.7836f, 7.4181f)
                curveTo(13.7429f, 5.8681f, 12.6535f, 4.575f, 12.0f, 3.8479f)
                curveTo(11.3465f, 4.575f, 10.2571f, 5.8681f, 9.2164f, 7.4181f)
                close()
            }
        }
        .build()
        return _drop!!
    }

private var _drop: ImageVector? = null